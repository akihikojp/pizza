//package jp.co.rakus.ecommerce_b.repository;
//
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.stereotype.Repository;
//
///**
// * @author yahiro
// *トッピングのレポジトリ
// */
//@Repository
//public class ToppingRepository {
//
//	NamedParameterJdbcTemplate template;
//	
//	
//	public static final RowMapper<Topping> toppingRowMapper = (rs,i) -> {
//		Topping topping = new Topping();
//		topping.setId(rs.getInt("id"));
//		topping.setName(rs.getString("name"));
//		topping.setPriceM(rs.getInt("priceM"));
//		topping.setPriceL(rs.getInt("priceL"));
//		return topping;
//		
//	};
//}
