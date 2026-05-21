-- schema.sql
-- 数据库建表SQL，适合MySQL 8.0+

CREATE TABLE device_category (
    id INT AUTO_INCREMENT PRIMARY KEY COMMENT '类别ID',
    name VARCHAR(100) NOT NULL COMMENT '类别名称'
);

CREATE TABLE device (
    id INT AUTO_INCREMENT PRIMARY KEY COMMENT '设备ID',
    name VARCHAR(100) NOT NULL COMMENT '设备名称',
    category_id INT NOT NULL COMMENT '设备类别',
    total_count INT DEFAULT 0 COMMENT '总数量',
    available_count INT DEFAULT 0 COMMENT '可领用数量',
    FOREIGN KEY (category_id) REFERENCES device_category(id)
);

CREATE TABLE user (
    id INT AUTO_INCREMENT PRIMARY KEY COMMENT '用户ID',
    name VARCHAR(100) NOT NULL COMMENT '用户名',
    phone VARCHAR(20) DEFAULT NULL COMMENT '联系电话',
    role VARCHAR(20) DEFAULT NULL COMMENT '角色'
);

CREATE TABLE device_instock (
    id INT AUTO_INCREMENT PRIMARY KEY,
    device_id INT NOT NULL,
    in_count INT NOT NULL,
    in_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (device_id) REFERENCES device(id)
);

CREATE TABLE device_borrow_return (
    id INT AUTO_INCREMENT PRIMARY KEY,
    device_id INT NOT NULL,
    user_id INT NOT NULL,
    borrow_count INT NOT NULL,
    borrow_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    return_count INT DEFAULT 0,
    return_time DATETIME DEFAULT NULL,
    FOREIGN KEY (device_id) REFERENCES device(id),
    FOREIGN KEY (user_id) REFERENCES user(id)
);

CREATE TABLE device_broken (
    id INT AUTO_INCREMENT PRIMARY KEY,
    device_id INT NOT NULL,
    broken_count INT NOT NULL,
    broken_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (device_id) REFERENCES device(id)
);
