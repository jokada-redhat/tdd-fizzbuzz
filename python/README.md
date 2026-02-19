# FizzBuzz (Python)

TDD で FizzBuzz を実装する Python 版です。pytest でテストします。

## 必要なもの

- Python 3.9+

## セットアップ・コマンド

```bash
pip install -e ".[dev]"   # 開発インストール（初回）
pytest                    # テスト実行
python -m fizzbuzz        # 1〜100 を表示
```

### Docker で実行（Python 未導入時）

リポジトリルートで、`python` ディレクトリをマウントして同じコマンドを実行できます。pip のキャッシュを `python/.pip-cache` に置くので、2 回目以降は依存の再ダウンロードが不要です。

```bash
# リポジトリルートで
docker run --rm -v "$(pwd)/python:/app" -w /app -e PIP_CACHE_DIR=/app/.pip-cache python:3.12 bash -c "pip install -q -e '.[dev]' && pytest"
docker run --rm -v "$(pwd)/python:/app" -w /app -e PIP_CACHE_DIR=/app/.pip-cache python:3.12 bash -c "pip install -q -e '.[dev]' && python -m fizzbuzz"
```

## 構成

- `fizzbuzz/fizzbuzz.py` — 本体（`of(n: int) -> str`）
- `fizzbuzz/__main__.py` — `python -m fizzbuzz` 用エントリポイント
- `tests/test_fizzbuzz.py` — pytest テスト
- `.pip-cache/` — pip のキャッシュ（Docker で使用時は自動作成・gitignore 済み）
