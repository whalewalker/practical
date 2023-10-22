package patterns.cdp.factoryMethod.example.database;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConnectionPool {
    private final List<Storage> storagePool = new ArrayList<>();

    public void addStorage(Storage... storages) {
        Collections.addAll(storagePool, storages);
    }

    public void releaseConnection(Storage... storages) {
        for (Storage storage : storages) {
            storagePool.remove(storage);
            System.out.println("Connection remove from pool");
        }
    }

    public void connectAll() {
        for (Storage storage : storagePool) {
            storage.connect();
        }
    }

    public void disconnectAll() {
        for (Storage storage : storagePool) {
            storage.disconnect();
        }
    }

    public void connectStorage(Storage storage) {
        if (storagePool.contains(storage)) {
            storage.connect();
        } else {
            System.out.println("Storage not found in the connection pool.");
        }
    }

    public void disconnectStorage(Storage storage) {
        if (storagePool.contains(storage)) {
            storage.disconnect();
        } else {
            System.out.println("Storage not found in the connection pool.");
        }
    }
}

