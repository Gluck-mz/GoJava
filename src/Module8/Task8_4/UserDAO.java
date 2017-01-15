package Module8.Task8_4;

import Module8.Task8_3.AbstractDAOImpl;

import java.util.List;

public class UserDAO<User> extends AbstractDAOImpl {
    @Override
    public Object save(Object o) {
        return super.save(o);
    }

    @Override
    public void delete(Object o) {
        super.delete(o);
    }

    @Override
    public void deleteAll(List list) {
        super.deleteAll(list);
    }

    @Override
    public void saveAll(List list) {
        super.saveAll(list);
    }

    @Override
    public List getList() {
        return super.getList();
    }

    @Override
    public void deleteById(long id) {
        super.deleteById(id);
    }

    @Override
    public Object get(long id) {
        return super.get(id);
    }
}
