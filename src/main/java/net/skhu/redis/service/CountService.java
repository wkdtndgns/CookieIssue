package net.skhu.redis.service;

import net.skhu.redis.domain.Count;


public interface CountService {
    Count findById(final String id);
    void saveCount(final Count count);
    void deleteCount(final String id);

}
