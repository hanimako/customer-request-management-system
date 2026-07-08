CREATE TABLE requests (
    id INTEGER GENERATED ALWAYS AS IDENTITY,
    request_datetime TIMESTAMP NOT NULL,
    approved BOOLEAN NOT NULL DEFAULT FALSE,
    requester_name VARCHAR(12) NOT NULL,
    requester_address VARCHAR(100) NOT NULL,
    content VARCHAR(200) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT requests_pk PRIMARY KEY (id)
);

COMMENT ON TABLE requests
IS '申請テーブル';

COMMENT ON COLUMN requests.id
IS '申請ID';

COMMENT ON COLUMN requests.request_datetime
IS '申請日時';

COMMENT ON COLUMN requests.approved
IS '承認済フラグ';

COMMENT ON COLUMN requests.requester_name
IS '申請者名';

COMMENT ON COLUMN requests.requester_address
IS '申請者住所';

COMMENT ON COLUMN requests.content
IS '申請内容';

COMMENT ON COLUMN requests.created_at
IS '新規登録日時';

COMMENT ON COLUMN requests.updated_at
IS '更新日時';
