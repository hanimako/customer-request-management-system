# 申請管理システム

## システム概要
お客様向けWebシステムで申請手続きを行い、社内担当者向けシステムで申請確認、承認を行う。
承認済みの申請情報を別システムへデータ連携する。

## 使用技術
- Next.js：お客様向けWebシステム

- Spring Boot・Thymeleaf：社内担当者向けシステム

- PowerAutomate：データ連携

- PostgreSQL：共通DB

## ディレクトリ構成
~~~test
customer-request-management-system
┣━README.md
┣━docs/             # 要件定義、画面設計、システム構成など
┣━db/               # テーブル定義、DDL
┣━public-web/       # お客様向けNext.jsアプリケーション
┗━internal-admin/   # 社内向けSpring Boot・Thymeleafアプリケーション
~~~

## 各設計書へのリンク
- [要件定義書](docs/requirements.md)
- [業務フロー](docs/business-flow.md)
- [システム方式設計](docs/system-architecture.md)
- [画面定義](docs/screen-list.md)
- [テスト方針](docs/test-plan.md)

## プロトタイプの範囲
本プロトタイプでは、お客様からの申請登録と、社内担当者による申請確認・承認までの基本的な流れを実装する。

### 対象機能
- お客様向け申請登録画面
- 申請情報のデータベース登録
- 社内担当者向け申請一覧画面
- 申請の承認
- 承認状態のデータベース更新

### 対象外
以下の機能は、プロトタイプ完成後に段階的に実装する。
- ユーザ登録・ログイン
- 入力内容の確認画面
- 登録完了画面
- 申請詳細画面
- 未承認・承認済み一覧の分割
- 申請の却下・差戻し
