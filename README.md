# 设备管理系统

## 项目结构

```
project/
├─ backend/                   # Java Spring Boot, src/main/java/...
├─ frontend/                  # 前端界面 (Vue, React等)
├─ db/
│   ├─ schema.sql             # 数据库建表SQL
│   └─ procedure.sql          # 存储过程SQL
└─ README.md
```

## 简介

本系统实现设备管理、用户管理、设备入库、领用归还、报损管理，以及相关统计。

- **数据库设计与存储过程**详见 `db/` 目录
- `backend/` 目录建议使用 Java + Spring Boot
- `frontend/` 目录建议使用 Vue 或 React

### 功能简介
- 设备类别、设备信息管理
- 用户管理
- 设备入库，自动更新数量
- 设备的领用和归还，自动更新可领用数量
- 设备的报损，自动更新数量和可领用数量
- 创建存储过程统计设备类别数量和指定月份领用归还

---

## QuickStart

1. 初始化MySQL数据库
```sql
-- 初始化表结构
source db/schema.sql;
-- 初始化存储过程
source db/procedure.sql;
```
2. 搭建后端 Java Spring Boot 项目，配置 application.yml 指向该数据库。
3. 前端（Vue/React）实现基础管理界面，可通过 REST API 访问后端接口。

---

详细业务逻辑见需求说明和代码实现。
