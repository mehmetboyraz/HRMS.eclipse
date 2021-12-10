package kodlamaio.HRMS.core.adapters.concretes;



import java.util.Locale;

import org.springframework.stereotype.Service;

import kodlamaio.HRMS.core.adapters.abstracts.MernisCheckService;
import kodlamaio.HRMS.core.utilities.results.Result;
import kodlamaio.HRMS.core.utilities.results.errorResult;
import kodlamaio.HRMS.core.utilities.results.successResult;
import kodlamaio.HRMS.entities.concretes.JobSeeker;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
@Service
public class MernisCheckManager implements MernisCheckService {

	@Override
	public Result checkIfRealPerson(JobSeeker jobSeeker) throws  Exception {
		
		KPSPublicSoapProxy kpsPublicSoap = new KPSPublicSoapProxy(); 
			boolean result =  kpsPublicSoap.TCKimlikNoDogrula(
					jobSeeker.getIdentity_number(), 
					jobSeeker.getName().toUpperCase(new Locale("tr","TR")), 
					jobSeeker.getLast_name().toUpperCase(new Locale("tr","TR")), jobSeeker.getBirth_year());
			if(!result) {
		return new errorResult("mernis başarısız");
	}
		return new successResult("başarılı mernis ");
	}
}
 