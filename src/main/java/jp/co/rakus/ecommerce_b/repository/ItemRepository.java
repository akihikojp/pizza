package jp.co.rakus.ecommerce_b.repository;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import jp.co.rakus.ecommerce_b.domain.Item;

/**
 * @author yahiro
 *商品情報（ピザ単体）のレポジトリ
 */
@Repository
public class ItemRepository {

	NamedParameterJdbcTemplate template;
	
	
	public static final RowMapper<Item> itemRowMapper = (rs,i) -> {
		Item item = new Item();
		item.setId(rs.getInt("id"));
		item.setName(rs.getString("name"));
		item.setPriceM(rs.getInt("priceM"));
		item.setPriceL(rs.getInt("priceL"));
		item.setImagePath(rs.getString("imagePath"));
		item.setDeleted(rs.getBoolean("deleted"));
		return item;
	};	
	
	/**
	 * 全ての商品を取り出す
	 * @return 全商品を格納したList<item>
	 */
	public List<Item> findAll(){
		String sql = "select id, name, description, price_m, price_l, image_path, deleted from items";
		return template.query(sql, itemRowMapper);
	}
	
	/**
	 * 対象IDのItemを１件取り出す
	 * @param id itemのID
	 * @return itemオブジェクト１件
	 */
	public Item findById(Integer id) {
		String sql = "select id, name, description, price_m, price_l, image_path, deleted from items where id = :id";
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
		return template.queryForObject(sql, param, itemRowMapper);
	}
	
}
