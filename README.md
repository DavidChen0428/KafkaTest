# Kafka #
## Introduction ##
Kafka 的特色 :
- **低延遲、高吞吐量**
- 持久化存儲 (訊息保存)
- 分散式架構
---
## Pre-configuration ##
1. Kafka(3.5.0版本)
2. Java 專案

- Kafka的安裝及配置
  - 確認JAVA JVM有確實安裝
  - 下載Kafka安裝封包並解封
  - 配置zookeeper.properties
  - 配置server.properties
  - 使用CMD產生zookeeper(固定順序)
  - 使用CMD產生broker(固定順序)

- JAVA專案開啟
---
## zookeeper.properties ##
此檔案位置在解壓縮後的檔案夾內的config/zookeeper.properties<br>
設置 :
- broker.id -> broker的標示符
- listeners -> 指定broker接受的地址與端口
- log.dirs -> 存放消息的目錄位址
- zookeeper.connect -> 指定zookeeper的連接地址
---
## server.properties ##

---
## Test ##
- 新增User成功
![新增User成功](https://drive.google.com/uc?export=view&id=1x3oTPi8jtbjm4QTKlEao3iz3uE07MYef)<br>
- Console訊息
![Console訊息](https://drive.google.com/uc?export=view&id=1t2hFO8mRuXb5N7_pVY-qlytjF5thKbUc)<br>
---
