package za.ac.nwu.milesreward.translator.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.ac.nwu.milesreward.repo.config.RepositoryConfig;
import za.ac.nwu.milesreward.repo.persistence.AccountTypeRepository;

@Import({RepositoryConfig.class})
@Configuration
@ComponentScan(basePackages = {
        "za.ac.nwu.milesreward.translator"
})

public class TranslatorConfig {
}
