//package jp.co.rakus.ecommerce_b.repository;
//
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.stereotype.Repository;
//
///**
// * @author yahiro
// *商品情報（ピザ単体）のレポジトリ
// */
//@Repository
//public class ItemRepository {
//
//	NamedParameterJdbcTemplate template;
//	
//	
//	public static final RowMapper<Item> itemRowMapper = (rs,i) -> {
//		Item item = new Item();
//		item.setId(rs.getInt("id"));
//		item.setName(rs.getString("name"));
//		item.setPriceM(rs.getInt("priceM"));
//		item.setPriceL(rs.getInt("priceL"));
//		item.setImagePath(rs.getString("imagePath"));
//		item.setDeleted(rs.getBoolean("deleted"));
//		return item;
//		
//	};	
//
//}
