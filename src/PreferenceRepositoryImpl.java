
import java.util.ArrayList;
import java.util.List;

    public class PreferenceRepositoryImpl implements PreferenceRepository {

        private List<Preference> store = new ArrayList<>();
        private long idCounter = 1;

        @Override
        public Preference save(Preference newPreference) {

            if (newPreference.getId() == null) {
                newPreference.setId(idCounter++);
                store.add(newPreference);
                return newPreference;
            }

            for (int count = 0; count < store.size(); count++) {
                if (store.get(count).getId().equals(newPreference.getId())) {
                    store.set(count, newPreference);
                    return newPreference;
                }
            }
            store.add(newPreference);
            return newPreference;
        }

        @Override
        public Preference findById(Long id) {
            for (Preference preference : store) {

                if (preference.getId().equals(id)) {
                    return preference;
                }
            }

            return null;
        }

        @Override
        public List<Preference> findAll() {
            return store;
        }

        @Override
        public void deleteById(Long id) {

            for (int count = 0;
                 count < store.size();
                 count++) {

                if (store.get(count).getId().equals(id)) {
                    store.remove(count);
                    return;
                }
            }
        }

        @Override
        public void delete(Preference preference) {
            store.remove(preference);
        }

        @Override
        public long count() {
            return store.size();
        }
    }

