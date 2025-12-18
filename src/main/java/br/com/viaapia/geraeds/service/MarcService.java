package br.com.viaapia.geraeds.service;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.marc4j.marc.DataField;
import org.marc4j.marc.Leader;
import org.marc4j.marc.MarcFactory;
import org.springframework.stereotype.Service;

import br.com.viaapia.geraeds.model.Titulo;
import br.com.viaapia.geraeds.model.TituloEds;
import br.com.viaapia.geraeds.util.Marc008Util;

import org.marc4j.marc.Record;

@Service
public class MarcService {
    // private final TituloEdsRepository tituloEdsRepository;
    private final Marc008Util marc008Util;

    public MarcService(// TituloEdsRepository tituloEdsRepository,
            Marc008Util marc008Util) {
        // this.tituloEdsRepository = tituloEdsRepository;
        this.marc008Util = marc008Util;
    }

    public void geraArquivoMarc(String caminhoArquivo) throws Exception {
        MarcFactory factory = MarcFactory.newInstance();
        Record record = factory.newRecord();
        Leader leader = factory.newLeader("00000nam a2200000 a 4500");
        record.setLeader(leader);

        addControlFields(record, null);

        DataField field245 = factory.newDataField("245", '1', '0');
        field245.addSubfield(factory.newSubfield('a', "Spring Boot na prática"));
        field245.addSubfield(factory.newSubfield('c', "Via Appia"));
        record.addVariableField(field245);
        try (OutputStream out = new FileOutputStream(caminhoArquivo)) {

        }
    }

    private void addControlFields(Record record, Titulo titulo) {
        MarcFactory factory = MarcFactory.newInstance();
        record.addVariableField(factory.newControlField("001", titulo.getIdTitulo().toString()));
        record.addVariableField(factory.newControlField("003", "BR-CEUB"));
        record.addVariableField(factory.newControlField("005", LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss.S"))));
        record.addVariableField(factory.newControlField("008", marc008Util.build008(titulo)));
    }
}
