package com.fangwei.service;

import java.util.List;

import com.fangwei.domain.News;
/**
 * ��ȡ���µ���Ƶ��Ϣ
 * @author Administrator
 *
 */
public interface VideoNewService {

	public abstract List<News> getLastNews();

}