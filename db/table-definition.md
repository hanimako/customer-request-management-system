# テーブル定義
## 申請テーブル
### 項目定義
項目名          ：項目ID                ：制約
1. 申請ID       ：application_id        ：INT PK NotNull　連番
2. 申請番号     ：application_no        ：VARCHAR(20) 
3. 申請日時     ：application_datetime  ：TIMESTAMP NotNull
4. 承認済フラグ ：pproved_flag          ：BOOLEAN NotNull　初期値false(未承認)
5. 申請者名     ：applicant_name        ：VARCHAR(12) NotNull
6. 申請者住所   ：address               ：VARCHAR(100) NotNull
6. 申請内容     ：application_datails   ：VARCHAR(200) NotNull
7. 新規登録日時 ：created_at            ：TIMESTAMP NotNull
8. 更新日時     ：updated_at            ：TIMESTAMP NotNull
