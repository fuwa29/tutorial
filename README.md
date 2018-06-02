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
