package phongnhatravelbackendver2.service;

import phongnhatravelbackendver2.entity.TypesEntity;

public interface ITypeService {
	TypesEntity getTypeByTitle(String title);
}
