package com;

import com.cache.BasicCache;
import com.cache.Cache;
import com.cache.DefaultLotteryWinnerCache;
import com.cache.DefaultStatisticalCache;
import com.cache.LotteryWinnerCache;
import com.cache.StatisticalCache;

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
