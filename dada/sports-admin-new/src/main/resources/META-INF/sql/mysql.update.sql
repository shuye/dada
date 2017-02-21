/** 2015.07.21 */
ALTER TABLE sports.T_SPORT_MEMBER ADD COLUMN `RECOMMEND_FLAG` int(1) DEFAULT '0' COMMENT '会员推荐 0不推荐 1推荐';
ALTER TABLE sports.T_SPORT_MEMBER ADD COLUMN `RECOMMEND_ORDER` int(11) DEFAULT NULL COMMENT '会员推荐顺序';

/** 2015.07.23 */
ALTER TABLE website.`user` ADD COLUMN `recommendFlag` int(1) DEFAULT '0' COMMENT '达人推荐 0不推荐 1推荐';

/** 2015.07.24 */
ALTER TABLE sports.T_SPORT_VENUES ADD COLUMN `PROVINCE` varchar(32) DEFAULT NULL COMMENT '所在省份';

/** 2015.07.27 */
ALTER TABLE sports.T_SPORT_VENUE_DISTRICT ADD COLUMN `DISTRICT_CODE` varchar(32) DEFAULT NULL COMMENT '片区编号';