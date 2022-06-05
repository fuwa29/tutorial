# tutorial
拡張子mdとは、マークダウンのことでした。
## gitコマンド
基本の流れ
#### 1. staging
> git add (file name)  
#### 2. commit to master
> git commit -m "comment"  
#### 3. push remote
> git push -u origin master  

## リモートとローカルの設定
1. Create remote repository  
githubで作成  
1. init local repository  
対象ディレクトリに移動してから以下実行
> git init  

1. add remote  
local側でリモート設定  
> git  remote add <repo_name> <url>  
> (例）git remote add origin gti@github.com/fuwa29/tutorial.git  

	確認
> git remote -v

# vscodeでGitHubからリポジトリをクローンして利用する
## GitHub上のリポジトリを複製する
- コマンドパレット開く
- gitctl （Git Cloneを選ぶ）
- GitHub上のリポジトリのurlをセット
- クローンを保管したいローカルPC上のフォルダを選択

## ローカルのファイルをGitHubに管理開始する
ソースを先に作成してしまってから、後からgitに登録したいなと思った時の方法メモ
1. 当該dirで 
    > git init
1. リモートリポジトリの設定
    > git remote add origin https://(github)/ユーザ名/リポジトリ名.git
1. gitにファイルを追加
    > git add *.*
    > git commmit -m 'コメント'
1. リモートリポジトリにプッシュ
    > git push origin master


# 以下はmarkdown記法のサンプル
# 見出し１
## 見出し２
### 見出し３
#### 見出し４
##### 見出し５
###### 見出し６

#### 箇条書き
- List 1
  - nest List1
    - nest2 List1
    - nest2 List2
    - nest List2
- List2

#### 番号付き
1. aaaa  
    1. bbbb  
    1. bbbb2  
    1. bbbb3  
1. bbbb
1. cccc
1. dddd
    1. aaaa
    1. aaaa
    1. hhhh
      1. gggg
1. finish

> 引用  
>> git add (staging)  
>> git commit  
>> git push origin master  
