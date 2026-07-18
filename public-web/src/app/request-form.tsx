"use client"

import { createRequest } from "./actions";

export default function RequestFrom() {
  return (
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
  );
}
