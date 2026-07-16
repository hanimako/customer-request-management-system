import { pool } from "@/lib/db";

export default function Home() {
  return (
    <main>
      <div>
        <h1>申請画面</h1>
      </div>
      <div>
        {/* フォーム申請時にServer ActionのcreateRequestを実行する */}
        <form action={createRequest}>
          <div>
            <label htmlFor="requester_name">申請者名：</label>
            <input id="requester_name" name="requester_name" type="text"></input>
          </div>
          <div>
            <label htmlFor="requester_address">住所：</label>
            <input id="requester_address" name="requester_address" type="text"></input>
          </div>
          <div>
            <label htmlFor="content">申請内容：</label>
            <input id="content" name="content" type="text"></input>
          </div>
          <div>
            <input type="submit" value="申請登録"></input>
          </div>
        </form>
        </div>
    </main>
  );
}

// 申請フォームの入力内容をrequestsテーブルに登録する。
// プロトタイプのため、入力チェックと登録完了画面は未実装。
async function createRequest(formData: FormData) {
  "use server";

  const requesterName = formData.get("requester_name");
  const requesterAddress = formData.get("requester_address");
  const content = formData.get("content");

  const result = await pool.query(
    `
      INSERT INTO requests (
        request_datetime,
        requester_name,
        requester_address,
        content 
      ) 
      VALUES (
        CURRENT_TIMESTAMP,
        $1,
        $2,
        $3
      )
    `,
    [requesterName, requesterAddress, content]
  );
};
