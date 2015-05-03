package cn.com.gps169.db.dao;

import cn.com.gps169.db.model.DailyStat;
import cn.com.gps169.db.model.DailyStatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DailyStatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gps_daily_stat
     *
     * @mbggenerated
     */
    int countByExample(DailyStatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gps_daily_stat
     *
     * @mbggenerated
     */
    int deleteByExample(DailyStatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gps_daily_stat
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer dailyStatId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gps_daily_stat
     *
     * @mbggenerated
     */
    int insert(DailyStat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gps_daily_stat
     *
     * @mbggenerated
     */
    int insertSelective(DailyStat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gps_daily_stat
     *
     * @mbggenerated
     */
    List<DailyStat> selectByExample(DailyStatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gps_daily_stat
     *
     * @mbggenerated
     */
    DailyStat selectByPrimaryKey(Integer dailyStatId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gps_daily_stat
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") DailyStat record, @Param("example") DailyStatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gps_daily_stat
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") DailyStat record, @Param("example") DailyStatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gps_daily_stat
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DailyStat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gps_daily_stat
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DailyStat record);
}