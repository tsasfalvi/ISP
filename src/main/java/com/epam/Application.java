package com.epam;

import com.epam.cache.BasicCache;
import com.epam.cache.Cache;
import com.epam.cache.DefaultLotteryWinnerCache;
import com.epam.cache.DefaultStatisticalCache;
import com.epam.cache.LotteryWinnerCache;
import com.epam.cache.StatisticalCache;

public class Application {

	public static void main(String[] args) {
		Cache<String> stringCache = new BasicCache<>();
		StatisticalCache statisticalCacheCache = new DefaultStatisticalCache();
		LotteryWinnerCache lotteryWinnerCache = new DefaultLotteryWinnerCache();

		use(stringCache);
		monitor(statisticalCacheCache);
		winLottery(lotteryWinnerCache);
	}

	private static void monitor(StatisticalCache stringCache) {
		Monitor<String> stringCacheMonitor = new Monitor<String>(stringCache);
		stringCacheMonitor.printInfo();
	}

	private static void use(Cache<String> stringCache) {
		CacheUser cacheUser = new CacheUser(stringCache);
		cacheUser.use();
	}

	private static void winLottery(LotteryWinnerCache stringCache) {
		stringCache.callThisMethodToWinTheLottery();
	}

}
