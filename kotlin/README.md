# FizzBuzz (Kotlin)

TDD で FizzBuzz を実装する Kotlin 版です。Gradle でビルド・テストします。

## 必要なもの

- JDK 17+

## コマンド

プロジェクトに同梱の Gradle ラッパー（`./gradlew`）を使います。

```bash
./gradlew test    # テスト実行
./gradlew run     # 1〜100 を表示
```

### Docker で実行（Java 未導入時）

リポジトリルートで、`kotlin` ディレクトリをマウントして同じコマンドを実行できます。`GRADLE_USER_HOME` でキャッシュを `kotlin/gradle-user-home` に置くので、2回目以降は依存の再ダウンロードが不要です。

```bash
# リポジトリルートで
docker run --rm -v "$(pwd)/kotlin:/app" -w /app -e GRADLE_USER_HOME=/app/gradle-user-home eclipse-temurin:17-jdk ./gradlew test
docker run --rm -v "$(pwd)/kotlin:/app" -w /app -e GRADLE_USER_HOME=/app/gradle-user-home eclipse-temurin:17-jdk ./gradlew run
```

## 構成

- `src/main/kotlin/fizzbuzz/FizzBuzz.kt` — 本体（`of(n: Int): String`）
- `src/main/kotlin/fizzbuzz/Main.kt` — 実行用エントリポイント
- `src/test/kotlin/fizzbuzz/FizzBuzzTest.kt` — JUnit 5 テスト
- `gradle-user-home/` — Gradle の依存キャッシュ（Docker で使用時は自動作成・gitignore 済み）
