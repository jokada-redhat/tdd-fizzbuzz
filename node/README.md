# FizzBuzz (Node.js)

TDD で FizzBuzz を実装する Node.js 版です。Node 組み込みの test runner でテストします。

## 必要なもの

- Node.js 18+

## コマンド

```bash
npm test     # テスト実行
npm start    # 1〜100 を表示
```

### Docker で実行（Node 未導入時）

リポジトリルートで、`node` ディレクトリをマウントして同じコマンドを実行できます。

```bash
# リポジトリルートで
docker run --rm -v "$(pwd)/node:/app" -w /app node:22 npm test
docker run --rm -v "$(pwd)/node:/app" -w /app node:22 npm start
```

## 構成

- `src/fizzbuzz.js` — 本体（`of(n)`）
- `src/cli.js` — 実行用エントリポイント
- `test/fizzbuzz.test.js` — Node 組み込み test によるテスト
