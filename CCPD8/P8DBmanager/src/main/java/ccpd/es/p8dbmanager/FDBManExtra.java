/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ccpd.es.p8dbmanager;

import beleris.es.finaldbmanager.FDBMan;
import beleris.es.finalprimaryclasses.CLAllObjectList;
import beleris.es.finalprimaryclasses.NAlmRes;
import beleris.es.finalprimaryclasses.NExcluibles;
import beleris.es.finalprimaryclasses.NQuestions;
import beleris.es.finalprimaryclasses.NTypeQuestions;
import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author edavid
 */
public class FDBManExtra extends FDBMan {

    public FDBManExtra(String Url, String sTmpDBPass, String sTmpDBName, String sTmpDBUser, int idbtouse) {
        super(Url, sTmpDBPass, sTmpDBName, sTmpDBUser, idbtouse);
    }

    public List<NQuestions> LoadListQuestions(String tmpDBase, String tmpDBTable) {
        CLAllObjectList<NQuestions> tmpQuestions = new CLAllObjectList<>();
        CLAllObjectList<String> Columns = new CLAllObjectList<>();
        Columns = this.GetColumnsName(tmpDBTable);
        int count = getLastRow(tmpDBTable);
        CLAllObjectList<CLAllObjectList<String>> TheList = LoadList_Table(tmpDBase, tmpDBTable, Columns);
        for (int row = 0; row < count; row++) {
            NQuestions Question = new NQuestions();
            Question.setId_questions(Integer.parseInt(TheList.get(0).get(row)));
            Question.setQuestion_string(TheList.get(1).get(row));
            Question.setQuestion_recomendation(TheList.get(2).get(row));
            Question.setId_questiontype(Integer.parseInt(TheList.get(3).get(row)));
            tmpQuestions.add(Question);
        }

        return tmpQuestions;
    }

    public List<NAlmRes> LoadAnswersList(String tmpDBase, String tmpDBTable, String idClient, String IdEnterprise) {
        CLAllObjectList<NAlmRes> tmpQuestions = new CLAllObjectList<>();
        CLAllObjectList<String> Columns = new CLAllObjectList<>();
        Columns = this.GetColumnsName(tmpDBTable);
        int count = getLastRow(tmpDBTable);
        CLAllObjectList<CLAllObjectList<String>> TheList = LoadList_Table(tmpDBase, tmpDBTable, Columns, idClient, IdEnterprise);
        for (int row = 0; row < count; row++) {
            //LoadList(tmpDBase, Columns.get(row), idClient, IdEnterprise);
            NAlmRes tmpAlmRes = new NAlmRes();
            tmpAlmRes.setId_answers(Integer.parseInt(TheList.get(0).get(row)));
            tmpAlmRes.setExcluded(new BigInteger(TheList.get(1).get(row)));
            tmpAlmRes.setId_client(Integer.parseInt(TheList.get(2).get(row)));
            tmpAlmRes.setId_question(Integer.parseInt(TheList.get(3).get(row)));
            tmpAlmRes.setTheanswer(new BigInteger(TheList.get(4).get(row)));
            tmpQuestions.add(tmpAlmRes);
        }
        return tmpQuestions;
    }

    public List<NExcluibles> LoadExcludedList(String tmpDBase, String tmpDBTable, String idClient, String IdEnterprise) {
        CLAllObjectList<NExcluibles> tmpExcluded = new CLAllObjectList<>();
        CLAllObjectList<String> Columns = new CLAllObjectList<>();
        Columns = this.GetColumnsName(tmpDBTable);
        int count = getLastRow(tmpDBTable);
        CLAllObjectList<CLAllObjectList<String>> TheList = LoadList_Table(tmpDBase, tmpDBTable, Columns, idClient, IdEnterprise);
        LoadList_Table(tmpDBase, tmpDBTable, Columns);
        for (int row = 0; row < count; row++) {
            // LoadList(tmpDBase, Columns.get(row), idClient, IdEnterprise);
            NExcluibles tmpExcludedItem = new NExcluibles();
            tmpExcludedItem.setId_excluded(Integer.parseInt(TheList.get(0).get(row)));
            tmpExcludedItem.setNcatex(Integer.parseInt(TheList.get(1).get(row)));
            tmpExcluded.add(tmpExcludedItem);
        }

        return tmpExcluded;
    }

    public List<NTypeQuestions> LoadQuestionTypesList(String tmpDBTable, String tmpColunmName) {
        CLAllObjectList<NTypeQuestions> tmpTypeQuest = new CLAllObjectList<>();
        CLAllObjectList<String> Columns = new CLAllObjectList<>();
        // Columns = this.GetColumnsName(tmpColunmName);
        int count = getLastRow(tmpDBTable);
        CLAllObjectList<String> TheList = LoadList(tmpDBTable, tmpColunmName);
        for (int row = 0; row < count; row++) {
            // LoadList(tmpDBTable, Columns.get(row), idClient, IdEnterprise);
            NTypeQuestions tmpTypeQuestItem = new NTypeQuestions();
            tmpTypeQuestItem.setId_question_types(row);
            tmpTypeQuestItem.setQuestion_types_name(TheList.get(row));
            tmpTypeQuest.add(tmpTypeQuestItem);
        }

        return tmpTypeQuest;
    }

    public CLAllObjectList<String> GetClients() {
        return LoadList("ccpd_clients", "client_name");
    }

    public CLAllObjectList<String> GetEnterprises() {
        return LoadList("ccpd_enterprises", "enterprise_manager_name");
    }

    public void GetClientAndEnterpriseLists(CLAllObjectList<String> tmpClientList, CLAllObjectList<String> tmpEnterpriseList) {
        tmpClientList = GetClients();
        tmpEnterpriseList = GetEnterprises();
    }
}
