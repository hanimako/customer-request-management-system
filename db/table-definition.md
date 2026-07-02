# テーブル定義
## 申請テーブル
### 項目定義
項目名          ：項目ID                ：制約
1. 申請ID       ：application_id        ：INT PK NOTNULL　連番
2. 申請番号     ：application_no        ：VARCHAR(20) NOTNULL UNIQUE
3. 申請日時     ：application_datetime  ：TIMESTAMP NOTNULL
4. 承認済フラグ ：approved_flag         ：BOOLEAN NOTNULL　初期値false(未承認)
5. 申請者名     ：applicant_name        ：VARCHAR(12) NOTNULL
6. 申請者住所   ：applicant_address     ：VARCHAR(100) NOTNULL
7. 申請内容     ：application_details   ：VARCHAR(200) NOTNULL
8. 新規登録日時 ：created_at            ：TIMESTAMP NOTNULL
9. 更新日時     ：updated_at            ：TIMESTAMP NOTNULL
