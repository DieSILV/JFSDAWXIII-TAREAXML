package com.websystique.springbatch;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import com.websystique.springbatch.model.ExamResult;
public class ExamResultItemPreparedStatementSetter implements ItemPreparedStatementSetter<ExamResult>  {
	
    public void setValues(ExamResult result, PreparedStatement ps) throws SQLException {
        ps.setString(1, result.getStudentName());
        ps.setString(2, result.getDob());
        ps.setDouble(3, result.getPercentage());
    }
}
