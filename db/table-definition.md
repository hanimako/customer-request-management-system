# テーブル定義
## 申請テーブル
### 項目定義
項目名          ：項目ID                ：制約
1. 申請No.      ；application_no        ；INT4 PK NotNull　連番
2. 申請日時     ；application_datetime  ；TIMESTAMP NotNull
3. 承認済フラグ ；approved_flag         ；BOOLEAN NotNull　初期値false(未承認)
4. 申請者       ；applicant_name        ；VARCHAR(100) NotNull
6. 申請内容     ；application_datails   ；VARCHAR(200) NotNull
7. 登録日時     ；created_at            ；TIMESTAMP NotNull
8. 更新日時     ；updated_at            ；TIMESTAMP NotNull
