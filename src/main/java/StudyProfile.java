public enum StudyProfile {

    MANAGEMENT("Управление и администрирование проектов"),
    ANALIST("Системный анализ и управление"),
    DEVELOPMENT("Разработка"),
    DATASCIENCE("Прикладная математика"),
    SECURITY("Безопасность информационных технологий"),
    INFRASTRUCTURE("Поддержка вычислительных мощностей и телекоммуникаций");

    String specializecion;

    StudyProfile(String specializecion) {
        this.specializecion = specializecion;
    }

}



