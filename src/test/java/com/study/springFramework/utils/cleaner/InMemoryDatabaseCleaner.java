package com.study.springFramework.utils.cleaner;

import com.study.springFramework.application.repository.memory.MemoryStore;

public class InMemoryDatabaseCleaner implements DatabaseCleaner {
    @Override
    public void execute() {
        MemoryStore.clear();
    }
}
