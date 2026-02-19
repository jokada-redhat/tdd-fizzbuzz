# FizzBuzz (Java)

TDD で FizzBuzz を実装する Java 版です。Maven でビルド・テストします。

## 必要なもの

- JDK 17+

## コマンド

プロジェクトに同梱の Maven ラッパー（`./mvnw`）を使います。

```bash
./mvnw test                    # テスト実行
./mvnw compile exec:java -q   # 1〜100 を表示
```

### Docker で実行（Java 未導入時）

リポジトリルートで、`java` ディレクトリをマウントして同じコマンドを実行できます。

```bash
# リポジトリルートで
docker run --rm -v "$(pwd)/java:/app" -w /app eclipse-temurin:17-jdk ./mvnw test
docker run --rm -v "$(pwd)/java:/app" -w /app eclipse-temurin:17-jdk ./mvnw compile exec:java -q
```

## 構成

- `src/main/java/fizzbuzz/FizzBuzz.java` — 本体（`of(int n)`）
- `src/test/java/fizzbuzz/FizzBuzzTest.java` — JUnit 5 テスト
- `m2repo/` — 依存関係のローカルキャッシュ（自動作成・gitignore 済み）。Docker でもマウントされるので毎回ダウンロードしない
