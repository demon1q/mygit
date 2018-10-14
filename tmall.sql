/*创建数据库*/
DROP DATABASE IF EXISTS tmall;
CREATE DATABASE tmall DEFAULT CHARACTER SET utf8;

/*使用数据库*/
USE tmall;

/*创建表*/

/*user 用户表
id:编号
username:用户名
password:密码
name:姓名
idcard:身份证
sex:性别
telephone:电话
balance:余额
birthday:生日
email:邮箱
icon:头像名称
auth:权限
*/
DROP TABLE IF EXISTS user;
CREATE TABLE user (
  id int(11) NOT NULL AUTO_INCREMENT,
  username varchar(255) NOT NULL UNIQUE,
  password varchar(255) NOT NULL,
	name varchar(255) DEFAULT NULL ,
	idcard varchar(255) DEFAULT NULL,
	sex varchar(10) DEFAULT '男',
	telephone varchar(255) DEFAULT NULL,
	balance double DEFAULT NULL,
	birthday date DEFAULT NULL,
	email varchar(255) DEFAULT NULL ,
	icon varchar(255) DEFAULT NULL ,
	auth varchar(255) DEFAULT NULL ,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*category分类表
name:分类类名
*/
DROP TABLE IF EXISTS category;
CREATE TABLE category (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

/*product产品表
name: 产品名称
subTitle: 小标题
originalPrice: 原始价格
promotePrice: 优惠价格
stock: 库存
createDate: 创建日期
本表的外键cid，指向分类表的id字段
*/
DROP TABLE IF EXISTS product;
CREATE TABLE product (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(255) DEFAULT NULL,
  subTitle varchar(255) DEFAULT NULL,
  originalPrice double DEFAULT NULL,
  promotePrice double DEFAULT NULL,
  stock int(11) DEFAULT NULL,
  cid int(11) DEFAULT NULL,
  createDate datetime DEFAULT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_product_category FOREIGN KEY (cid) REFERENCES category (id)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

/*productimage产品图片表
type表示类型，产品图片分单个图片和详情图片两种
本表的外键pid，指向产品表的id字段
*/
DROP TABLE IF EXISTS productimage;
CREATE TABLE productimage (
  id int(11) NOT NULL AUTO_INCREMENT,
  pid int(11) DEFAULT NULL,
  type varchar(255) DEFAULT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_productimage_product FOREIGN KEY (pid) REFERENCES product (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*review评价表
content:评价内容
createDate:评价时间
外键pid，指向产品表的id字段
外键uid，指向用户表的id字段
*/
DROP TABLE IF EXISTS review;
CREATE TABLE review (
  id int(11) NOT NULL AUTO_INCREMENT,
  content varchar(4000) DEFAULT NULL,
  uid int(11) DEFAULT NULL,
  pid int(11) DEFAULT NULL,
  createDate datetime DEFAULT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_review_product FOREIGN KEY (pid) REFERENCES product (id),
    CONSTRAINT fk_review_user FOREIGN KEY (uid) REFERENCES user (id)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

/*orders订单表
orderCode： 订单号
address:收货地址
post: 邮编
receiver: 收货人信息
mobile: 手机号码
userMessage: 用户备注信息
createDate: 订单创建日期
payDate: 支付日期
deliveryDate: 发货日期
confirmDate：确认收货日期
status: 订单状态
外键uid，指向用户表id字段
*/
DROP TABLE IF EXISTS orders;
CREATE TABLE orders (
  id int(11) NOT NULL AUTO_INCREMENT,
  orderCode varchar(255) DEFAULT NULL,
  address varchar(255) DEFAULT NULL,
  post varchar(255) DEFAULT NULL,
  receiver varchar(255) DEFAULT NULL,
  mobile varchar(255) DEFAULT NULL,
  userMessage varchar(255) DEFAULT NULL,
  createDate datetime DEFAULT NULL,
  payDate datetime DEFAULT NULL,
  deliveryDate datetime DEFAULT NULL,
  confirmDate datetime DEFAULT NULL,
  uid int(11) DEFAULT NULL,
  status varchar(255) DEFAULT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_order_user FOREIGN KEY (uid) REFERENCES user (id)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

/*orderitem订单项表
number:购买数量
外键pid，指向产品表id字段
外键oid，指向订单表id字段
外键uid，指向用户表id字段
*/
DROP TABLE IF EXISTS orderitem;
CREATE TABLE orderitem (
  id int(11) NOT NULL AUTO_INCREMENT,
	number int(11) DEFAULT NULL,
  pid int(11) DEFAULT NULL,
  oid int(11) DEFAULT NULL,
  uid int(11) DEFAULT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_orderitem_user FOREIGN KEY (uid) REFERENCES user (id),
  CONSTRAINT fk_orderitem_product FOREIGN KEY (pid) REFERENCES product (id)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;