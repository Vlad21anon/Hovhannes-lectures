package lecturesHomework.L29.E2;

public interface Validation {
    boolean isValid(String password);

    abstract class Abstract implements Validation{
        private final String message;

        protected Abstract(String message) {
            this.message = message;
        }

        @Override
        public boolean isValid(String password){
            boolean success = isValidInner(password);
            if (!success){
                throw new IllegalArgumentException(message);
            }
            return success;
        }

        protected abstract boolean isValidInner(String password);
    }
}
