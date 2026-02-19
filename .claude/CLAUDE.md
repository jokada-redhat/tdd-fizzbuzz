# CLAUDE.md

このファイルは、リポジトリで作業する際に Claude Code (claude.ai/code) へのガイダンスを提供します。

## 言語設定

- 入出力（ユーザーとのやり取り）は日本語で行う
- 内部の思考（reasoning）は英語で行う

## プロジェクト概要

TDD（テスト駆動開発）で FizzBuzz を実装するプロジェクトです。Java / Swift / Kotlin / Python の 4 言語で同じ仕様のベースを用意しています。各言語は独立したサブディレクトリにあり、共通仕様は `of(n)` が 3 の倍数で "Fizz"、5 の倍数で "Buzz"、両方で "FizzBuzz"、それ以外は数を文字列で返すことです。

## ビルド・テスト

| 言語   | フォルダ   | テスト（全件）              | 実行（1〜100 表示）              |
|--------|------------|-----------------------------|----------------------------------|
| Java   | `java/`    | `./mvnw test`               | `./mvnw compile exec:java -q`    |
| Swift  | `swift/`   | `swift test`                 | `swift run FizzBuzzApp`          |
| Kotlin | `kotlin/`  | `./gradlew test`             | `./gradlew run`                  |
| Python | `python/`  | `pytest`（要 `pip install -e ".[dev]"`） | `python -m fizzbuzz`   |

各言語で `cd <フォルダ>` してから上記を実行。Java 未導入時などは Docker でも実行可能（コマンドはルートの `README.md` および各フォルダの `README.md` を参照）。

## キャッシュ・ラッパー

- **Java**: 依存は `java/m2repo/`（`.mvn/maven.config` で指定）。Maven ラッパーは `./mvnw`（only-script、Maven 3.9.9 をダウンロード）。
- **Kotlin**: Gradle のキャッシュは Docker 利用時に `kotlin/gradle-user-home/`（`GRADLE_USER_HOME` で指定）。ラッパーは `./gradlew`。
- **Python**: Docker 利用時の pip キャッシュは `python/.pip-cache`（`PIP_CACHE_DIR`）。
- **Swift**: ビルドキャッシュは `swift/.build`（マウントでそのまま残る）。

## 作業時のメモ

- コード変更時は、該当言語のテストが通ることを確認する。
- 詳細なコマンド・Docker の例はルート `README.md` と各 `java/README.md` 等を参照する。
