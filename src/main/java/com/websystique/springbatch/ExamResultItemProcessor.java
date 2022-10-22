package com.websystique.springbatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import com.websystique.springbatch.model.ExamResult;

public class ExamResultItemProcessor implements ItemProcessor<ExamResult, ExamResult> {
	private static final Logger LOG =LoggerFactory.getLogger(ExamResultItemProcessor.class);

    @Override
    public ExamResult process(ExamResult result) throws Exception {
		LOG.info("[DAW] Procesando Datos: {} ",result);    
        return result;
    }
}
