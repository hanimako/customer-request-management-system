"use server";

import { pool } from "@/lib/db";


// 申請フォームの入力内容をrequestsテーブルに登録する。
export async function createRequest(formData: FormData) {

  const requesterName = formData.get("requester_name");
  const requesterAddress = formData.get("requester_address");
  const content = formData.get("content");

  if (typeof requesterName !== "string" || (requesterName === "" )) {
    return;
  }
  if (typeof requesterAddress !== "string" || (requesterAddress === "" )) {
    return;
  }
  if (typeof content !== "string" || (content === "" )) {
    return;
  }

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
