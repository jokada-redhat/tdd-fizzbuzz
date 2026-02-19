# FizzBuzz (Swift)

TDD で FizzBuzz を実装する Swift 版です。Swift Package Manager でビルド・テストします。

## 必要なもの

- Swift 5.9+

## コマンド

```bash
swift test              # テスト実行
swift run FizzBuzzApp   # 1〜100 を表示
```

### Docker で実行（Swift 未導入時）

リポジトリルートで、`swift` ディレクトリをマウントして同じコマンドを実行できます。ビルドキャッシュは `swift/.build` に残るので 2 回目以降は速くなります。

```bash
# リポジトリルートで
docker run --rm -v "$(pwd)/swift:/app" -w /app swift:5.9 swift test
docker run --rm -v "$(pwd)/swift:/app" -w /app swift:5.9 swift run FizzBuzzApp
```

## 構成

- `Sources/FizzBuzz/FizzBuzz.swift` — 本体（`of(_ n: Int) -> String`）
- `Sources/FizzBuzzApp/main.swift` — 実行用エントリポイント
- `Tests/FizzBuzzTests/FizzBuzzTests.swift` — XCTest テスト
