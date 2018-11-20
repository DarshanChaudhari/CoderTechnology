import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeListServiceComponent } from './employee-list-service.component';

describe('EmployeeListServiceComponent', () => {
  let component: EmployeeListServiceComponent;
  let fixture: ComponentFixture<EmployeeListServiceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeeListServiceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeListServiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
