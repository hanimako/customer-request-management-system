# テーブル定義
## 申請テーブル
### 項目定義
| 項目名 | 項目ID | 制約 |
|---|---|---|
| 申請ID | id | INT PK NOTNULL　連番 |
| 申請日時 | request_datetime | TIMESTAMP NOTNULL |
| 承認済フラグ | approved | BOOLEAN NOTNULL　初期値false(未承認) |
| 申請者名 | requester_name | VARCHAR(12) NOTNULL |
| 申請者住所 | requester_address | VARCHAR(100) NOTNULL |
| 申請内容 | content | VARCHAR(200) NOTNULL |
| 新規登録日時 | created_at | TIMESTAMP NOTNULL |
| 更新日時 | updated_at | TIMESTAMP NOTNULL |
