import { pool } from "@/lib/db";

export default function Home() {
  return (
    <main>
      <div>
        <h1>申請画面</h1>
      </div>
      <div>
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

async function createRequest(formDate: FormData) {
  "use server";

  const requesterName = formDate.get("requester_name");
  const requesterAddress = formDate.get("requester_address");
  const content = formDate.get("content");

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
  console.log(result.rows);
};
