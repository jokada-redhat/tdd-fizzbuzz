# tdd-fizzbuzz

TDD（テスト駆動開発）の練習として FizzBuzz を実装するプロジェクトです。

## 構成

各言語で同じ仕様のベースを用意しています（`of(n)` は現状そのまま数を文字列で返すだけ。TDD で Fizz/Buzz/FizzBuzz を追加していく想定）。

| 言語   | フォルダ   | ビルド/テスト |
|--------|------------|----------------|
| Java   | `java/`    | Maven          |
| Swift  | `swift/`   | Swift Package Manager |
| Kotlin | `kotlin/`  | Gradle         |
| Python | `python/`  | pytest         |
| Node.js| `node/`    | npm (node --test) |

### Java

```bash
cd java
./mvnw test                  # テスト
./mvnw compile exec:java -q  # 1〜100 を表示
```

Docker（Java 未導入時、リポジトリルートで）:

```bash
docker run --rm -v "$(pwd)/java:/app" -w /app eclipse-temurin:17-jdk ./mvnw test
docker run --rm -v "$(pwd)/java:/app" -w /app eclipse-temurin:17-jdk ./mvnw compile exec:java -q
```

### Swift

```bash
cd swift
swift test                    # テスト
swift run FizzBuzzApp         # 1〜100 を表示
```

Docker（Swift 未導入時、リポジトリルートで。キャッシュは `swift/.build` に残る）:

```bash
docker run --rm -v "$(pwd)/swift:/app" -w /app swift:5.9 swift test
docker run --rm -v "$(pwd)/swift:/app" -w /app swift:5.9 swift run FizzBuzzApp
```

### Kotlin

```bash
cd kotlin
./gradlew test    # テスト
./gradlew run     # 1〜100 を表示
```

Docker（Java 未導入時、リポジトリルートで。キャッシュは `kotlin/gradle-user-home` に保存）:

```bash
docker run --rm -v "$(pwd)/kotlin:/app" -w /app -e GRADLE_USER_HOME=/app/gradle-user-home eclipse-temurin:17-jdk ./gradlew test
docker run --rm -v "$(pwd)/kotlin:/app" -w /app -e GRADLE_USER_HOME=/app/gradle-user-home eclipse-temurin:17-jdk ./gradlew run
```

### Python

```bash
cd python
pip install -e ".[dev]"   # 開発インストール（初回）
pytest                    # テスト
python -m fizzbuzz        # 1〜100 を表示
```

Docker（Python 未導入時、リポジトリルートで。キャッシュは `python/.pip-cache` に保存）:

```bash
docker run --rm -v "$(pwd)/python:/app" -w /app -e PIP_CACHE_DIR=/app/.pip-cache python:3.12 bash -c "pip install -q -e '.[dev]' && pytest"
docker run --rm -v "$(pwd)/python:/app" -w /app -e PIP_CACHE_DIR=/app/.pip-cache python:3.12 bash -c "pip install -q -e '.[dev]' && python -m fizzbuzz"
```

### Node.js

```bash
cd node
npm test     # テスト
npm start    # 1〜100 を表示
```

Docker（Node 未導入時、リポジトリルートで）:

```bash
docker run --rm -v "$(pwd)/node:/app" -w /app node:22 npm test
docker run --rm -v "$(pwd)/node:/app" -w /app node:22 npm start
```
