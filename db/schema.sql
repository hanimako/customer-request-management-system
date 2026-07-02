CREATE TABLE applications (
    application_id INT IDENTITY(1,1),
    application_no VARCHAR(20) NOT NULL UNIQUE,
    application_datetime DATETIME NOT NULL,
    approved_flag BOOLEAN NOT NULL DEFAULT FALSE,
    applicant_name VARCHAR(12) NOT NULL,
    applicant_address VARCHAR(100) NOT NULL,
    application_details VARCHAR(200) NOT NULL,
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT applications_pk PRIMARY KEY (application_id)
);

COMMENT ON TABLE applications
IS '申請テーブル';

COMMENT ON COLUMN applications.application_id
IS '申請ID';

COMMENT ON COLUMN applications.application_no
IS '申請番号';

COMMENT ON COLUMN applications.application_datetime
IS '申請日時';

COMMENT ON COLUMN applications.approved_flag
IS '承認済フラグ';

COMMENT ON COLUMN applications.applicant_name
IS '申請者名';

COMMENT ON COLUMN applications.applicant_address
IS '申請者住所';

COMMENT ON COLUMN applications.application_datails
IS '申請内容';

COMMENT ON COLUMN applications.created_at
IS '新規登録日時';

COMMENT ON COLUMN applications.updated_at
IS '更新日時';
