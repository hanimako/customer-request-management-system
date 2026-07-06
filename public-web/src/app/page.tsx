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
            <label htmlFor="applicant_name">申請者名：</label>
            <input id="applicant_name" name="applicant_name" type="text"></input>
          </div>
          <div>
            <label htmlFor="applicant_address">住所：</label>
            <input id="applicant_address" name="applicant_address" type="text"></input>
          </div>
          <div>
            <label htmlFor="application_details">申請内容：</label>
            <input id="application_details" name="application_details" type="text"></input>
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

  const applicantName = formDate.get("applicant_name");
  const applicantAddress = formDate.get("applicant_address");
  const applicationDetails = formDate.get("application_details");

  const result = await pool.query(
    `
      INSERT INTO applications (
        application_datetime,
        applicant_name,
        applicant_address,
        application_details 
      ) 
      VALUES (
        CURRENT_TIMESTAMP,
        $1,
        $2,
        $3
      )
    `,
    [applicantName, applicantAddress, applicationDetails]
  );
  console.log(result.rows);
};
