package by.owm.service.db;

import org.springframework.stereotype.Service;

/**
 * Created by haria on 13.10.2015.
 */
@Service
public interface DataService {

    boolean logIn(String name, String password);

    boolean create(String name, String password);
}
