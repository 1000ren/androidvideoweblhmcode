package com.fangwei.service;

import java.util.List;

import com.fangwei.domain.News;
/**
 * 获取最新的视频信息
 * @author Administrator
 *
 */
public interface VideoNewService {

	public abstract List<News> getLastNews();

}