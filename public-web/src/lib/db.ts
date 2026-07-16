import { Pool } from "pg";

// PostgreSQL接続時のコネクションプール。
// 接続先は環境変数 DATABASE_URL に設定する
export const pool = new Pool({
    connectionString: process.env.DATABASE_URL
});
