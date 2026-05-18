import java.util.List;

public interface PreferenceRepository {


        Preference save(Preference preference);

        Preference findById(Long id);

        List<Preference> findAll();

        void deleteById(Long id);

        void delete(Preference preference);

        long count();
    }

