package Module8.Task8_3;

import Module8.Task8_1.AbstractDAO;
import Module8.Task8_4.User;

import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl<T> implements AbstractDAO{
    public List<User> users = new ArrayList<>();

    @Override
    public Object save(Object o) {
        users.add((User) o);
        return o;
    }

    @Override
    public void delete(Object o) {
        users.remove((User) o);
    }

    @Override
    public void deleteAll(List list) {
        users.removeAll(list);
    }

    @Override
    public void saveAll(List list) {
        users.addAll(list);
    }

    @Override
    public List getList() {
        return users;
    }

    @Override
    public void deleteById(long id) {
        for (User u : users) {
            if (u.getId() == id) {
                users.remove(u);
            }
        }
    }

    @Override
    public Object get(long id) {
        for (User u : users) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }
}
