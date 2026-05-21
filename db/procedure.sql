-- procedure.sql
-- 存储过程SQL

-- 1. 各种类型设备数量统计
DELIMITER //
CREATE PROCEDURE GetDeviceCategoryCount()
BEGIN
  SELECT c.name, SUM(d.total_count) as total_count
  FROM device_category c
  JOIN device d ON c.id = d.category_id
  GROUP BY c.name;
END //
DELIMITER ;

-- 2. 指定月份设备的领用归还情况统计
DELIMITER //
CREATE PROCEDURE GetDeviceMonthlyBorrowReturn(IN month_str VARCHAR(7))
BEGIN
  -- month_str 格式'2024-05'
  SELECT d.name,
    SUM(br.borrow_count) as total_borrowed,
    SUM(br.return_count) as total_returned
  FROM device_borrow_return br
  JOIN device d ON br.device_id = d.id
  WHERE DATE_FORMAT(br.borrow_time, '%Y-%m') = month_str
  GROUP BY d.name;
END //
DELIMITER ;
