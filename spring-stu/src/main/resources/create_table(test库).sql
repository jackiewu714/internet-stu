
CREATE TABLE `product` (
  `id` bigint(20) NOT NULL auto_increment,
  `product_name` varchar(128) NOT NULL,
  `product_content` varchar(256) NOT NULL,
  `price` decimal(10,2) default NULL,
  `sort` int(11) default NULL,
  `false_sales` int(11) default NULL,
  `category_id` bigint(20) NOT NULL,
  `type` int(11) NOT NULL,
  `state` int(11) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


INSERT INTO product(product_name, product_content, price, sort, false_sales, category_id, type, state)
VALUE('牙刷', '', 12.50, 1, 4, 1001, 1, 1);
INSERT INTO product(product_name, product_content, price, sort, false_sales, category_id, type, state)
VALUE('牙膏', '', 20.90, 1, 4, 1001, 1, 1);
INSERT INTO product(product_name, product_content, price, sort, false_sales, category_id, type, state)
VALUE('护手霜', '', 10.00, 1, 4, 1001, 1, 1);
INSERT INTO product(product_name, product_content, price, sort, false_sales, category_id, type, state)
VALUE('瓜子', '', 8.50, 1, 4, 1001, 1, 1);
INSERT INTO product(product_name, product_content, price, sort, false_sales, category_id, type, state)
VALUE('花生', '', 17.50, 1, 4, 1001, 1, 1);
