package com.fangwei.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.fangwei.domain.News;
import com.fangwei.service.VideoNewService;

public class VideoNewsServiceBean implements VideoNewService {
	
	/* (non-Javadoc)
	 * @see com.fangwei.service.impl.VideoNewService#getLastNews()
	 */
	public List<News> getLastNews(){
		List<News> newses = new ArrayList<News>();
		newses.add(new News(35,"ϲ�������̫�ǵ�ȫ��",90));
		newses.add(new News(12,"�������̫��",20));
		newses.add(new News(56,"�Ϸ���LILI",30));
		return newses;
	}
}
